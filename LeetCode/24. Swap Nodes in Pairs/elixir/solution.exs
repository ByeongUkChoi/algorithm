# Definition for singly-linked list.
#
# defmodule ListNode do
#   @type t :: %__MODULE__{
#           val: integer,
#           next: ListNode.t() | nil
#         }
#   defstruct val: 0, next: nil
# end

defmodule Solution do
  @spec swap_pairs(head :: ListNode.t() | nil) :: ListNode.t() | nil
  def swap_pairs(head) do
    {l1, l2, same_length?} = put_two_lists(head)

    if same_length? do
      to_list_node_struct(l1, l2)
    else
      [h1 | t1] = l1
      to_list_node_struct([h1 | l2], t1)
    end
  end

  defp put_two_lists(l1 \\ [], l2 \\ [], flag \\ true, node)

  defp put_two_lists(l1, l2, flag, nil) do
    {l1, l2, flag}
  end

  defp put_two_lists(l1, l2, flag, node) do
    if flag do
      put_two_lists([node.val | l1], l2, not flag, node.next)
    else
      put_two_lists(l1, [node.val | l2], not flag, node.next)
    end
  end

  defp to_list_node_struct(l1, l2, flag \\ true, acc_node \\ nil)

  defp to_list_node_struct([], [], _flag, acc_node) do
    acc_node
  end

  defp to_list_node_struct([], [h | t], flag, acc_node) do
    to_list_node_struct([], t, not flag, %ListNode{val: h, next: acc_node})
  end

  defp to_list_node_struct([h | t], [], flag, acc_node) do
    to_list_node_struct(t, [], not flag, %ListNode{val: h, next: acc_node})
  end

  defp to_list_node_struct([h1 | t1] = l1, [h2 | t2] = l2, flag, acc_node) do
    if flag do
      to_list_node_struct(t1, l2, not flag, %ListNode{val: h1, next: acc_node})
    else
      to_list_node_struct(l1, t2, not flag, %ListNode{val: h2, next: acc_node})
    end
  end
end
