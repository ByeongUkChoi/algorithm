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
  @spec is_palindrome(head :: ListNode.t() | nil) :: boolean
  def is_palindrome(head) do
    head
    |> to_list()
    |> then(&(&1 == Enum.reverse(&1)))
  end

  defp to_list(node, acc \\ [])
  defp to_list(nil, acc), do: acc
  defp to_list(node, acc), do: to_list(node.next, [node.val | acc])
end
