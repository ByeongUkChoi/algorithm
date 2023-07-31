# Definition for a binary tree node.
#
# defmodule TreeNode do
#   @type t :: %__MODULE__{
#           val: integer,
#           left: TreeNode.t() | nil,
#           right: TreeNode.t() | nil
#         }
#   defstruct val: 0, left: nil, right: nil
# end

defmodule Solution do
  @spec kth_smallest(root :: TreeNode.t() | nil, k :: integer) :: integer
  def kth_smallest(root, k) do
    root
    |> to_sorted_list()
    |> Enum.at(k - 1)
  end

  defp to_sorted_list(bst, acc \\ [])

  defp to_sorted_list(nil, acc) do
    acc
  end

  defp to_sorted_list(%{val: val, left: left, right: nil}, acc) do
    to_sorted_list(left, [val | acc])
  end

  defp to_sorted_list(%{val: val, left: left, right: right}, acc) do
    new_acc = to_sorted_list(right, acc)
    to_sorted_list(left, [val | new_acc])
  end
end
